/*
 * Copyright 2006-2008 The MZmine Development Team
 * 
 * This file is part of MZmine.
 * 
 * MZmine is free software; you can redistribute it and/or modify it under the
 * terms of the GNU General Public License as published by the Free Software
 * Foundation; either version 2 of the License, or (at your option) any later
 * version.
 * 
 * MZmine is distributed in the hope that it will be useful, but WITHOUT ANY
 * WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR
 * A PARTICULAR PURPOSE. See the GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License along with
 * MZmine; if not, write to the Free Software Foundation, Inc., 51 Franklin St,
 * Fifth Floor, Boston, MA 02110-1301 USA
 */

package net.sf.mzmine.modules.identification.relatedpeaks;

import java.text.NumberFormat;

import net.sf.mzmine.data.Parameter;
import net.sf.mzmine.data.ParameterType;
import net.sf.mzmine.data.impl.SimpleParameter;
import net.sf.mzmine.data.impl.SimpleParameterSet;
import net.sf.mzmine.main.MZmineCore;

public class RelatedPeaksSearchParameters extends SimpleParameterSet {

	public static final NumberFormat percentFormat = NumberFormat
			.getPercentInstance();

	public static final Parameter rtTolerance = new SimpleParameter(
			ParameterType.DOUBLE, "Time tolerance",
			"Maximum allowed difference of time to set a relationship between peaks", null, new Double(10.0),
			new Double(0.0), null, MZmineCore.getRTFormat());

	public static final Parameter shapeTolerance = new SimpleParameter(
			ParameterType.DOUBLE,
			"Shape difference tolerance",
			"Maximum allowed difference of shape form to set a relationship between peaks",
			"m/z", new Double(0.1), new Double(0.0), new Double(1.0), percentFormat);

	public static final Parameter sharingPoints = new SimpleParameter(
			ParameterType.DOUBLE,
			"Sharing points",
			"Minimum required % of points (scans) in common to set a relationship between peaks",
			"%", new Double(0.85), new Double(0.0), new Double(1.0), percentFormat);

	public RelatedPeaksSearchParameters() {
		super(new Parameter[] { rtTolerance,
				shapeTolerance, sharingPoints });
	}
	
	
}