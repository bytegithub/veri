/*******************************************************************************
 * Copyright (c) 2014 Daniel Murygin.
 *
 * This program is free software: you can redistribute it and/or 
 * modify it under the terms of the GNU Lesser General Public License 
 * as published by the Free Software Foundation, either version 3 
 * of the License, or (at your option) any later version.
 * This program is distributed in the hope that it will be useful,    
 * but WITHOUT ANY WARRANTY; without even the implied warranty 
 * of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  
 * See the GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program. 
 * If not, see <http://www.gnu.org/licenses/>.
 * 
 * Contributors:
 *     Daniel Murygin <dm[at]sernet[dot]de> - initial API and implementation
 ******************************************************************************/
package sernet.gs.service;

import sernet.verinice.model.common.CnATreeElement;


/**
 * @author Daniel Murygin <dm[at]sernet[dot]de>
 *
 */
public class CnaTreeElementNumericStringComparator extends AbstractNumericStringComparator<CnATreeElement> {

    private static final long serialVersionUID = -1848460666860207431L;

    /* (non-Javadoc)
     * @see sernet.gs.service.AbstractNumericStringComparator#convertToString(java.lang.Object)
     */
    @Override
    public String convertToString(CnATreeElement element) {
        return element.getTitle();
    }

}
