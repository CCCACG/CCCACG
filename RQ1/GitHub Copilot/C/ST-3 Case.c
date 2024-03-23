/**
  * @brief  Returns the transmit or the receive CRC register value for the specified SPI.
  * @param  SPIx: where x can be 1, 2 or 3 to select the SPI peripheral.
  * @param  SPI_CRC: specifies the CRC register to be read.
  *   This parameter can be one of the following values:
  *     @arg SPI_CRC_Tx: Selects Tx CRC register
  *     @arg SPI_CRC_Rx: Selects Rx CRC register
  * @retval The selected CRC register value..
  */
//Source Code: 0-2 01793.c
uint16_t SPI_GetCRC(SPI_TypeDef* SPIx, uint8_t SPI_CRC){
  uint16_t crcreg = 0;
  /* Check the parameters */
  assert_param(IS_SPI_ALL_PERIPH(SPIx));
  assert_param(IS_SPI_CRC(SPI_CRC));
  if (SPI_CRC != SPI_CRC_Rx)
  {
    /* Get the Tx CRC register */
    crcreg = SPIx->TXCRCR;
  }
  else
  {
    /* Get the Rx CRC register */
    crcreg = SPIx->RXCRCR;
  }
  /* Return the selected CRC register */
  return crcreg;
}

//Synthesized Code, Syntax Similarity:0.8, res_00002.c
uint16_t SPI_GetCRC(SPI_TypeDef* SPIx, uint8_t SPI_CRC)
{
  __IO uint16_t tmpreg = 0;

  /* Check the parameters */
  assert_param(IS_SPI_ALL_PERIPH(SPIx));
  assert_param(IS_SPI_CRC(SPI_CRC));

  if (SPI_CRC != SPI_CRC_Rx)
  {
    /* Get the Tx CRC register */
    tmpreg = SPIx->TXCRCR;
  }
  else
  {
    /* Get the Rx CRC register */
    tmpreg = SPIx->RXCRCR;
  }

  /* Return the selected CRC register */
  return (uint16_t)tmpreg;
}