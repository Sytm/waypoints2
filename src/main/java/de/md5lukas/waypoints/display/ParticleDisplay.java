/*
 *     waypoints2
 *     Copyright (C) 2019  Lukas Planz
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

package de.md5lukas.waypoints.display;

import de.md5lukas.waypoints.data.waypoint.Waypoint;
import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;
@Deprecated
public final class ParticleDisplay extends WaypointDisplay {

	protected ParticleDisplay(Plugin plugin, long updateInterval) {
		super(plugin, updateInterval);
	}

	@Override
	public void show(Player player, Waypoint waypoint) {
		// TODO
	}

	@Override
	public void update(Player player, Waypoint waypoint) {

	}

	@Override
	public void disable(Player player) {

	}
}