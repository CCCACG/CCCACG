# Source Code
def center_loss(features, label, alfa, nrof_classes):
    """Center loss based on the paper "A Discriminative Feature Learning Approach for Deep Face Recognition"
       (http://ydwen.github.io/papers/WenECCV16.pdf)
    """
    nrof_features = features.get_shape()[1]
    centers = tf.get_variable('centers', [nrof_classes, nrof_features], dtype=tf.float32,
        initializer=tf.constant_initializer(0), trainable=False)
    label = tf.reshape(label, [-1])
    centers_batch = tf.gather(centers, label)
    diff = (1 - alfa) * (centers_batch - features)
    centers = tf.scatter_sub(centers, label, diff)
    loss = tf.reduce_mean(tf.square(features - centers_batch))
    return loss, centers

# Generated Code by Copilot Chat
def center_loss(alfa, nrof_classes, features, label):
    """Center loss based on the paper "A Discriminative Feature Learning Approach for Deep Face Recognition"
       (http://ydwen.github.io/papers/WenECCV16.pdf)
    """
    # Initialize centers tensor
    centers = tf.get_variable('centers', [nrof_classes, features.get_shape()[1]], dtype=tf.float32,
        initializer=tf.constant_initializer(0), trainable=False)
    
    # Gather centers for each label
    centers_batch = tf.gather(centers, label)
    
    # Calculate center loss
    center_loss = tf.reduce_mean(tf.square(features - centers_batch))
    
    # Update centers
    diff = centers_batch - features
    unique_label, unique_idx, unique_count = tf.unique_with_counts(label)
    appear_times = tf.gather(unique_count, unique_idx)
    appear_times = tf.reshape(appear_times, [-1, 1])
    diff = diff / tf.cast((1 + appear_times), tf.float32)
    diff = alfa * diff
    centers_update_op = tf.scatter_sub(centers, label, diff)
    
    return center_loss, centers_update_op
