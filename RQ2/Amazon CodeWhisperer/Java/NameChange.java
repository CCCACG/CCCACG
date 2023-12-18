// Convert the name of function to underscore case.

/**
 * <code>repeated float weight_decay = 8;</code>
 *
 * <pre>
 * The weight decay that is multiplied on the global weight decay.
 * </pre>
 */
public Builder addWeightDecay(float value){
	ensureWeightDecayIsMutable();
	weightDecay_.add(value);
	onChanged();
	return this;
}


// Generated Code by CodeWhisperer
/**
 * <code>repeated float weight_decay = 8;</code>
 *
 * <pre>
 * The weight decay that is multiplied on the global weight decay.
 * </pre>
 */
public Builder add_weight_decay(float value)
{
  ensure_weight_decay_is_mutable();
  weight_decay_.addFloat(value);
  onChanged();
  return this;
}