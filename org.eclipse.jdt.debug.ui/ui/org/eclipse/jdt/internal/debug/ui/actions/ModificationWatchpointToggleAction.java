package org.eclipse.jdt.internal.debug.ui.actions;

/*
 * (c) Copyright IBM Corp. 2000, 2001.
 * All Rights Reserved.
 */
 
import org.eclipse.core.runtime.CoreException;
import org.eclipse.jdt.debug.core.IJavaBreakpoint;
import org.eclipse.jdt.debug.core.IJavaWatchpoint;

public class ModificationWatchpointToggleAction extends BreakpointToggleAction {

	/**
	 * @see BreakpointToggleAction#getToggleState(IJavaBreakpoint)
	 */
	protected boolean getToggleState(IJavaBreakpoint watchpoint) throws CoreException {
		return ((IJavaWatchpoint)watchpoint).isModification();
	}

	/**
	 * @see BreakpointToggleAction#doAction(IJavaBreakpoint)
	 */
	public void doAction(IJavaBreakpoint watchpoint) throws CoreException {
		((IJavaWatchpoint)watchpoint).setModification(!((IJavaWatchpoint)watchpoint).isModification());
	}

	/**
	 * @see BreakpointToggleAction#isEnabledFor(Object)
	 */
	public boolean isEnabledFor(Object element) {
		return element instanceof IJavaWatchpoint;
	}
}

