# Source Code,1024-2048 00343
def wrap_deepmind(env, episode_life=True, stack_len=None, image_downsize=None):
    '''Wrap Atari environment DeepMind-style'''
    if episode_life:
        env = EpisodicLifeEnv(env)
    if 'FIRE' in env.unwrapped.get_action_meanings():
        env = FireResetEnv(env)
    env = PreprocessImage(env, image_downsize)
    if stack_len is not None:  # use concat for image (1, 84, 84)
        env = FrameStack(env, 'concat', stack_len)
    return env

# Synthesized Code, syntax similarity:0.8,res_00001.py
def wrap_deepmind(env, episode_life=True, stack_len=None, image_downsize=None):

    assert 'NoFrameskip' in env.spec.id
    if episode_life:
        env = EpisodicLifeEnv(env)
    if 'FIRE' in env.unwrapped.get_action_meanings():
        env = FireResetEnv(env)
    env = WarpFrame(env, image_downsize)
    if stack_len:
        env = FrameStack(env, stack_len)
    return env
