// Source Code
/**
 * Creates a new {@link GridRegistry} and starts it.
 *
 * @param hub the {@link Hub} to associate this registry with
 * @param proxySet the {@link ProxySet} to manage proxies with
 * @return the registry
 */
public static GridRegistry newInstance(Hub hub, ProxySet proxySet){
    ZaleniumRegistry registry = new ZaleniumRegistry(hub, proxySet);
    registry.start();
    return registry;
}

// Generated code by Copilot Chat
/**
 * Creates a new {@link GridRegistry} and starts it.
 *
 * @param hub the {@link Hub} to associate this registry with
 * @param proxySet the {@link ProxySet} to manage proxies with
 * @return the registry
 */
public static GridRegistry newInstance(ProxySet proxySet, Hub hub) {
    GridRegistry registry = new GridRegistry(proxySet, hub);
    registry.start();
    return registry;
}