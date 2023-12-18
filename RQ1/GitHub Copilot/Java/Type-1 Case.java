/**
 * <code>string name = 1;</code>
 *
 * @return The name.
 */
@java.lang.Override
public java.lang.String getName(){
  java.lang.Object ref = name_;
  if (ref instanceof java.lang.String) {
    return (java.lang.String) ref;
  } else {
    com.google.protobuf.ByteString bs =
      (com.google.protobuf.ByteString) ref;
    java.lang.String s = bs.toStringUtf8();
    name_ = s;
    return s;
  }
}

// Generated Code by GitHub Copilot
@java.lang.Override
public java.lang.String getName()
{
  java.lang.Object ref = name_;
  if (ref instanceof java.lang.String)
  {
    return (java.lang.String) ref;
  }
  else
  {
    com.google.protobuf.ByteString bs = 
        (com.google.protobuf.ByteString) ref;
    java.lang.String s = bs.toStringUtf8();
    name_ = s;
    return s;
  }
}