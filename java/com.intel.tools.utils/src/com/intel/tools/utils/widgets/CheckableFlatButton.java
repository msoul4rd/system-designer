/*
 * Copyright (C) 2013-2017 Intel Corporation
 *
 * This Program is subject to the terms of the Eclipse Public License, v. 1.0.
 * If a copy of the license was not distributed with this file,
 * you can obtain one at <http://www.eclipse.org/legal/epl-v10.html>
 *
 * SPDX-License-Identifier: EPL-1.0
 */
package com.intel.tools.utils.widgets;

import org.eclipse.swt.widgets.Composite;

public class CheckableFlatButton extends FlatButton {

    public CheckableFlatButton(final Composite parent, final FlatButtonStyle style) {
        super(parent, style);

        isCheckable = true;
    }

    public boolean isChecked() {
        return isChecked;
    }
}
