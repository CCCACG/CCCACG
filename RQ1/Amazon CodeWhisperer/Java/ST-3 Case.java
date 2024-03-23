/**
 * This method initializes memoryUsagePanel1
 * 
 * @return net.sf.profiler4j.console.MemoryUsagePanel
 */
//Source Code, 0-2 test_00314
private MemoryPlotPanel getNonHeapMemoryUsagePanel(){
    if (nonHeapMemoryUsagePanel == null) {
        nonHeapMemoryUsagePanel = new MemoryPlotPanel("Non-Heap Memory");
    }
    return nonHeapMemoryUsagePanel;
}

// Synthesized Code, syntax similarity: 0.75
private MemoryPlotPanel getNonHeapMemoryUsagePanel()
{
    if (nonHeapMemoryUsagePanel == null)
    {
        nonHeapMemoryUsagePanel = new MemoryPlotPanel(Profiler4J.getNonHeapMemoryUsage());
    }
    return nonHeapMemoryUsagePanel;
}