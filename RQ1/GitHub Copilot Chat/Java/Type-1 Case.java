/**
 * <code>required string passwd = 2;</code>
 *
 * <pre>
 * 用户密码
 * </pre>
 */
//Source Code
public Builder setPasswd(
    java.lang.String value){
  if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
  passwd_ = value;
  onChanged();
  return this;
}

//Synthesized Code
public Builder setPasswd(java.lang.String value) {
    if (value == null) {
        throw new NullPointerException();
    }
    bitField0_ |= 0x00000002;
    passwd_ = value;
    onChanged();
    return this;
}