package org.elasticsearch.plugin.fields;

import java.util.ArrayList;
import java.util.Collection;

import org.elasticsearch.common.inject.Inject;
import org.elasticsearch.common.inject.Module;
import org.elasticsearch.common.settings.Settings;
import org.elasticsearch.helpers.fields.SettingsHelper;
import org.elasticsearch.plugins.AbstractPlugin;

public final class ComputedFieldsPlugin extends AbstractPlugin
{
    @Inject  
    public ComputedFieldsPlugin(Settings settings)
    {
        SettingsHelper.SetSettings(settings);
    }
    
    @Override
    public String name()
    {
        return "computed-fields";
    } 

    @Override
    public String description()
    {
        return "Adds support for indexing computed fields";
    }
    
    @Override
    public Collection<Class<? extends Module>> indexModules() 
    {
        Collection<Class<? extends Module>> modules = new ArrayList<Class<? extends Module>>();
        modules.add(ComputedFieldsModule.class);
        return modules;
    }
}
