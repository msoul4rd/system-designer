/* ============================================================================
 * INTEL CONFIDENTIAL
 *
 * Copyright 2015-2016 Intel Corporation All Rights Reserved.
 *
 * The source code contained or described herein and all documents related to
 * the source code ("Material") are owned by Intel Corporation or its suppliers
 * or licensors. Title to the Material remains with Intel Corporation or its
 * suppliers and licensors. The Material contains trade secrets and proprietary
 * and confidential information of Intel or its suppliers and licensors. The
 * Material is protected by worldwide copyright and trade secret laws and
 * treaty provisions. No part of the Material may be used, copied, reproduced,
 * modified, published, uploaded, posted, transmitted, distributed, or
 * disclosed in any way without Intel's prior express written permission.
 *
 * No license under any patent, copyright, trade secret or other intellectual
 * property right is granted to or conferred upon you by disclosure or delivery
 * of the Materials, either expressly, by implication, inducement, estoppel or
 * otherwise. Any license under such intellectual property rights must be
 * express and approved by Intel in writing.
 * ============================================================================
 */
package com.intel.tools.fdk.graphframework.displayer.layer;

import org.eclipse.draw2d.FigureUtilities;
import org.eclipse.draw2d.FreeformLayer;
import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.geometry.Point;

import com.intel.tools.fdk.graphframework.figure.IGraphFigure;
import com.intel.tools.utils.IntelPalette;

/** A layer intended to be in the background.
 *  This layer will always capture click events (even if no child figure is at the clicked point).
 */
public class BackgroundLayer extends FreeformLayer {

    public BackgroundLayer() {
        super();
        setForegroundColor(IntelPalette.LIGHT_GREY);
    }

    @Override
    /** All click event made on a background layer is captured */
    public boolean containsPoint(final int x, final int y) {
        return true;
    }

    @Override
    protected void paintFigure(final Graphics graphics) {
        super.paintFigure(graphics);
        FigureUtilities.paintGrid(graphics, this, new Point(0, 0), IGraphFigure.SIZE_UNIT, IGraphFigure.SIZE_UNIT);
    }

}
