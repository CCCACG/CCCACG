# Source Code 01605.py
def get_train_transforms_deit(config):
    """ Get full training transforms (as DeiT)
    For training, a RandomResizedCrop is applied with random mirror,
    then RandAug, AutoAug or ColorJitter is applied,
    then normalization is applied with mean and std,
    and RandomErase is applied.
    The input pixel values must be rescaled to [0, 1.].
    Outputs is converted to tensor.
    
    Args:
        config: configs contains IMAGE_SIZE, see config.py for details
    Returns:
        transforms_train: transform ops
    """
    aug_op_list = []
    # STEP1: random crop and resize
    aug_op_list.append(
        transforms.RandomResizedCrop((config.DATA.IMAGE_SIZE, config.DATA.IMAGE_SIZE),
                                     scale=(0.08, 1.0), interpolation='bicubic'))
    # STEP2: random horizontalflip
    aug_op_list.append(transforms.RandomHorizontalFlip())
    # STEP3: rand_augment or auto_augment or color jitter
    if config.TRAIN.RAND_AUGMENT: # MAE: True
        policy = rand_augment_policy_increasing(
            magnitude_idx=config.TRAIN.RAND_AUGMENT_MAGNITUDE)
        rand_augment = RandAugment(
            policy=policy, num_layers=config.TRAIN.RAND_AUGMENT_LAYERS)
        aug_op_list.append(rand_augment)
    elif config.TRAIN.AUTO_AUGMENT: # MAE: None
        policy = auto_augment_policy_original()
        auto_augment = AutoAugment(policy)
        aug_op_list.append(auto_augment)
    else: # MAE: None
        jitter = (float(config.TRAIN.COLOR_JITTER), ) * 3
        aug_op_list.append(transforms.ColorJitter(*jitter))
    # STEP3: other ops
    aug_op_list.append(transforms.ToTensor())
    aug_op_list.append(transforms.Normalize(mean=config.DATA.IMAGENET_MEAN,
                                            std=config.DATA.IMAGENET_STD))
    # STEP4: random erasing
    if config.TRAIN.RANDOM_ERASE_PROB > 0.:
        random_erasing = RandomErasing(prob=config.TRAIN.RANDOM_ERASE_PROB,
                                       mode=config.TRAIN.RANDOM_ERASE_MODE,
                                       max_count=config.TRAIN.RANDOM_ERASE_COUNT,
                                       num_splits=config.TRAIN.RANDOM_ERASE_SPLIT)
        aug_op_list.append(random_erasing)
    # Final: compose transforms and return
    transforms_train = transforms.Compose(aug_op_list)
    
    return transforms_train

# Synthesized Code, syntax similarity:0.19,res_00006.py
def get_train_transforms_deit(config):

    # Random crop
    transform = transforms.RandomResizedCrop(config.IMAGE_SIZE, scale=(config.CROP_SCALE[0], 1.))
    # Random horizontal flip
    transform.transforms.append(transforms.RandomHorizontalFlip())
    # RandAug
    if config.USE_RANDAUG:
        transform.transforms.append(RandAugment(config.RANDAUG_N, config.RANDAUG_M))
    # AutoAug
    elif config.USE_AUTOAUG:
        transform.transforms.append(AutoAugment())
    # ColorJitter
    elif config.USE_COLORJIT:
        transform.transforms.append(transforms.ColorJitter(brightness=0.4, contrast=0.4, saturation=0.4, hue=0.1))
    # Normalize
    transform.transforms.append(transforms.ToTensor())
    transform.transforms.append(transforms.Normalize(config.MEAN, config.STD))
    # Random Erase
    transform.transforms.append(transforms.RandomErasing(p=0.25, scale=(0.02, 0.33), ratio=(0.3, 3.3)))
    return transform
