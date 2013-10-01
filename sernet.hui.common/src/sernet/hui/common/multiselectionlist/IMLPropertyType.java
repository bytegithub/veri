/*******************************************************************************
 * Copyright (c) 2009 Alexander Koderman <ak[at]sernet[dot]de>.
 * This program is free software: you can redistribute it and/or 
 * modify it under the terms of the GNU Lesser General Public License 
 * as published by the Free Software Foundation, either version 3 
 * of the License, or (at your option) any later version.
 *     This program is distributed in the hope that it will be useful,    
 * but WITHOUT ANY WARRANTY; without even the implied warranty 
 * of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  
 * See the GNU Lesser General Public License for more details.
 *     You should have received a copy of the GNU Lesser General Public 
 * License along with this program. 
 * If not, see <http://www.gnu.org/licenses/>.
 * 
 * Contributors:
 *     Alexander Koderman <ak[at]sernet[dot]de> - initial API and implementation
 ******************************************************************************/
package sernet.hui.common.multiselectionlist;

import java.util.List;



/**
 * a list of options for a given name (property type).
 * 
 * @author prack
 */
public interface IMLPropertyType {

	/**
	 * Returns all options for this property type.
	 * i.e. black, brown, beige
	 * 
	 * @return
	 */
	List<IMLPropertyOption> getOptions();
	
	/**
	 * Return a name for this list of options (i.e. "colour")
	 * 
	 * @return
	 */
	String getName();
	
	String getId();
	
	boolean isMultiselect();

}
