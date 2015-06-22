package com.herocraftonline.heroes.common.components;

import com.herocraftonline.heroes.api.characters.CharacterBase;
import com.herocraftonline.heroes.api.components.Component;
import com.herocraftonline.heroes.api.components.core.ManaTracker;
import com.herocraftonline.heroes.api.plugin.HeroesPlugin;
import com.herocraftonline.heroes.api.util.Combiner;
import org.spongepowered.api.data.DataQuery;
import org.spongepowered.api.data.DataView;

public class ComponentMana implements Component, ManaTracker {

    private long currMana;
    private long maxMana;

    @Override
    public boolean cloneOnLoad() {
        return true;
    }

    @Override
    public String getName() {
        return "mana";
    }

    @Override
    public void onInit(HeroesPlugin plugin) {

    }

    @Override
    public void onAttach(CharacterBase character, DataView data) {
        long max = data.getLong(new DataQuery("max")).or(0L);
        if (character != null) {
            long perLevel = data.getLong(new DataQuery("max-per-level")).or(0L);
        }

        long mana = data.getLong(new DataQuery("current")).or(maxMana);
        return; //TODO
    }

    @Override
    public void onRemove(CharacterBase character) {

    }

    @Override
    public DataView onSave(Character character) {
        return null;
    }

    @Override
    public Combiner<DataView> getCombiner() {
        return null;
    }

    @Override
    public Component clone() {
        return null;
    }

    @Override
    public double getMaxMana() {
        return 0;
    }

    @Override
    public double getMana() {
        return 0;
    }

    @Override
    public void setMana(double amount) {

    }

    @Override
    public void setMaxMana(double amount) {

    }
}
