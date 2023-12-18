// Convert the names of parameters to underscore case.

// Source Code
/**
 * @brief   Establish a link to a peer device.
 *
 * Public function defined in central.h.
 */
bStatus_t GAPCentralRole_EstablishLink( uint8 highDutyCycle, uint8 whiteList,
                                        uint8 addrTypePeer, uint8 *peerAddr ){
  gapEstLinkReq_t params;

  params.taskID = gapCentralRoleTaskId;
  params.highDutyCycle = highDutyCycle;
  params.whiteList = whiteList;
  params.addrTypePeer = addrTypePeer;
  VOID osal_memcpy( params.peerAddr, peerAddr, B_ADDR_LEN );

  return GAP_EstablishLinkReq( &params );
}

// Generated Code by Copilot
/**
 * @brief   Establish a link to a peer device.
 *
 * Public function defined in central.h.
 */
bStatus_t GAPCentralRole_EstablishLink( uint8 high_duty_cycle, uint8 white_list,
                                        uint8 addr_type_peer, uint8 *peer_addr )
{
  gapEstLinkReq_t params;
  if (state != GAPROLE_STARTED)
  {
    return bleIncorrectMode;
  }
  if (linkDB_NumActive() >= maxNumBleConns)
  {
    return bleNoResources;
  }
  params.taskID = gapCentralRole_TaskID;
  params.highDutyCycle = high_duty_cycle;
  params.whiteList = white_list;
  params.addrTypePeer = addr_type_peer;
  VOID osal_memcpy( params.peerAddr, peer_addr, B_ADDR_LEN );
  return GAP_EstablishLinkReq( &params );
}