// Source Code
/**
  * @brief  Enables or disables the CRC value calculation of the transfered bytes.
  * @param  SPIx: where x can be 1, 2 or 3 to select the SPI peripheral.
  * @param  NewState: new state of the SPIx CRC value calculation.
  *   This parameter can be: ENABLE or DISABLE.
  * @retval None
  */
void SPI_CalculateCRC(SPI_TypeDef* SPIx, FunctionalState NewState){
  /* Check the parameters */
  assert_param(IS_SPI_ALL_PERIPH(SPIx));
  assert_param(IS_FUNCTIONAL_STATE(NewState));
  if (NewState != DISABLE)
  {
    /* Enable the selected SPI CRC calculation */
    SPIx->CR1 |= CR1_CRCEN_Set;
  }
  else
  {
    /* Disable the selected SPI CRC calculation */
    SPIx->CR1 &= CR1_CRCEN_Reset;
  }
}

// Synthesized Code, syntax similarity:0.59
void SPI_CalculateCRC(SPI_TypeDef* SPIx, FunctionalState NewState)
{
    if (NewState != DISABLE)
    {
        // Enable the CRC calculation
        SPIx->CR1 |= SPI_CR1_CRCEN;
    }
    else
    {
        // Disable the CRC calculation
        SPIx->CR1 &= ~SPI_CR1_CRCEN;
    }
}