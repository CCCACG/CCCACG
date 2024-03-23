// Source Code (4096-8192 test_00734.java)
/**
 * Returns the first codec capable of encoding the specified MIME type, or
 * null if no match was found.
 */
private static MediaCodecInfo selectCodec(String mimeType)
{
    int numCodecs = MediaCodecList.getCodecCount();
    for (int i = 0; i < numCodecs; i++)
    {
        MediaCodecInfo codecInfo = MediaCodecList.getCodecInfoAt(i);

        if (!codecInfo.isEncoder())
        {
            continue;
        }

        String[] types = codecInfo.getSupportedTypes();
        for (int j = 0; j < types.length; j++)
        {
            if (types[j].equalsIgnoreCase(mimeType))
            {
                return codecInfo;
            }
        }
    }
    return null;
}

// Synthesized Code
private static MediaCodecInfo selectCodec(String mimeType)
{
    int numCodecs = MediaCodecList.getCodecCount();
    for (int i = 0; i < numCodecs; i++)
    {
        MediaCodecInfo codecInfo = MediaCodecList.getCodecInfoAt(i);
        if (!codecInfo.isEncoder())
        {
            continue;
        }
        String[] types = codecInfo.getSupportedTypes();
        for (int j = 0; j < types.length; j++)
        {
            if (types[j].equalsIgnoreCase(mimeType))
            {
                return codecInfo;
            }
        }
    }
    return null;
}