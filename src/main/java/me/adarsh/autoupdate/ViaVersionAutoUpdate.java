package me.adarsh.autoupdate;

/**
 * The entrance point of the ViaVersionAutoUpdate program
 */
public class ViaVersionAutoUpdate {

    private IPlugin plugin;

    public ViaVersionAutoUpdate(IPlugin plugin) {
        this.plugin = plugin;

        // Check for an update on startup,
        new UpdateChecker(this).run();
    }

    /**
     * Get the plugin
     * @return The IPlugin for this instance
     */
    public IPlugin getPlugin() {
        return plugin;
    }
}
