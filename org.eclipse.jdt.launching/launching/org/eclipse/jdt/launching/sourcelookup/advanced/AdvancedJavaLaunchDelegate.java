/*******************************************************************************
 * Copyright (c) 2016 Igor Fedorenko
 *
 * This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License 2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *      Igor Fedorenko - initial API and implementation
 *******************************************************************************/
package org.eclipse.jdt.launching.sourcelookup.advanced;

import org.eclipse.jdt.launching.JavaLaunchDelegate;

/**
 * A launch delegate for launching local Java applications with advanced source lookup support.
 *
 * @since 3.10
 * @provisional This is part of work in progress and can be changed, moved or removed without notice
 */
public class AdvancedJavaLaunchDelegate extends JavaLaunchDelegate {

	public AdvancedJavaLaunchDelegate() {
		allowAdvancedSourcelookup();
	}

}
