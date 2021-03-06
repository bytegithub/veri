/*******************************************************************************
 * Copyright (c) 2017 Sebastian Hagedorn.
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
 *     Sebastian Hagedorn sh[at]sernet.de - initial API and implementation
 ******************************************************************************/
package sernet.verinice.bp.rcp.action;

import sernet.gs.ui.rcp.main.bsi.actions.AbstractAddCnATreeElementActionDelegate;
import sernet.verinice.interfaces.ActionRightIDs;

/**
 * @author Sebastian Hagedorn sh[at]sernet.de
 *
 */
public abstract class AbstractAddBpElementActionDelegate extends AbstractAddCnATreeElementActionDelegate {

    @Override
    public String getRightID(){
        return ActionRightIDs.ADDBPELEMENT;
    }

}
