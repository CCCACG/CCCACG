/**
 *
 * A utility method to help work with topics in the conversation
 */
// Source Code
public static Object retrieveEventTopicAndClear(Injector injector, String topicParam){
    Object topic = null;

    final InternalConversation conversation = injector.getInstance(InternalConversation.class);
    if (null != topicParam) {
        if (!TextTools.isEmptyString(topicParam))
            topic = conversation.recall(Integer.parseInt(topicParam));
    }

    //clear out internal monologue!!!
    conversation.forgetAll();

    return topic;
}

// Synthesized Code, syntax similarity: 0.14
public static Object retrieveEventTopicAndClear(Injector injector, String topicParam)
{
    Object topic = injector.getNamedParameter(topicParam);
    injector.clearNamedParameter(topicParam);
    return topic;
}