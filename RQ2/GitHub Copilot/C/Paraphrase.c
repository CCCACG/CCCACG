// Source Code
/**
  * @brief  Return the manufacturer string descriptor
  * @param  speed : Current device speed
  * @param  length : Pointer to data length variable
  * @retval Pointer to descriptor buffer
  */
uint8_t * USBD_HS_ManufacturerStrDescriptor(USBD_SpeedTypeDef speed, uint16_t *length){
  UNUSED(speed);
  USBD_GetString((uint8_t *)USBD_MANUFACTURER_STRING, USBD_StrDesc, length);
  return USBD_StrDesc;
}

// Generated Code by Copilot
/**
  * @brief  This function returns the string descriptor of the manufacturer.
  * @param  speed : The current speed of the device
  * @param  length : A pointer to the variable that stores the length of the data
  * @retval A pointer to the buffer that holds the descriptor
  */
uint8_t * USBD_HS_ManufacturerStrDescriptor(USBD_SpeedTypeDef speed, uint16_t *length)
{
  *length = sizeof(USBD_HS_Manufacturer_String);
  return USBD_HS_Manufacturer_String;
}
