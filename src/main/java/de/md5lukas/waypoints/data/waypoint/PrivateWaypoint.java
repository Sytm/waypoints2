/*
 *     Waypoints2, A plugin for spigot to add waypoints functionality
 *     Copyright (C) 2020  Lukas Planz
 *
 *     This program is free software: you can redistribute it and/or modify
 *     it under the terms of the GNU Affero General Public License as published
 *     by the Free Software Foundation, either version 3 of the License, or
 *     (at your option) any later version.
 *
 *     This program is distributed in the hope that it will be useful,
 *     but WITHOUT ANY WARRANTY; without even the implied warranty of
 *     MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *     GNU Affero General Public License for more details.
 *
 *     You should have received a copy of the GNU Affero General Public License
 *     along with this program.  If not, see <https://www.gnu.org/licenses/>.
 */

package de.md5lukas.waypoints.data.waypoint;

import de.md5lukas.i18n.translations.ItemTranslation;
import de.md5lukas.nbt.tags.CompoundTag;
import de.md5lukas.waypoints.Waypoints;
import de.md5lukas.waypoints.config.WPConfig;
import de.md5lukas.waypoints.display.BlockColor;
import org.bukkit.Location;
import org.bukkit.Material;

public class PrivateWaypoint extends Waypoint {

    public PrivateWaypoint(CompoundTag tag) {
        super(tag);
    }

    public PrivateWaypoint(String name, Location location) {
        super(name, location);
    }

    @Override
    public Material getMaterial() {
        return material == null ? WPConfig.getInventoryConfig().getPrivateWaypointMenuConfig().getDefaultItem() : material;
    }

    @Override
    public BlockColor getBeaconColor() {
        return beaconColor == null ? WPConfig.getDisplayConfig().getBeaconConfig().getDefaultColorPrivate() : beaconColor;
    }

    @Override
    public ItemTranslation getItemTranslation() {
        return Waypoints.getITranslations().WAYPOINT_PRIVATE;
    }

    public static PrivateWaypoint fromCompoundTag(CompoundTag tag) {
        return new PrivateWaypoint(tag);
    }
}
