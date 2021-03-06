/*
 * Copyright 2009-2013 Aarhus University
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package dk.brics.tajs.analysis.dom.view;

import static dk.brics.tajs.analysis.dom.DOMFunctions.createDOMProperty;
import dk.brics.tajs.analysis.State;
import dk.brics.tajs.analysis.dom.DOMWindow;
import dk.brics.tajs.analysis.dom.html.HTMLDocument;
import dk.brics.tajs.lattice.Value;

/**
 * A base interface that all views shall derive from.
 */
public class AbstractView {

    public static void build(State s) {
        // AbstractView has no native object.

        /*
         * Properties.
         */
        createDOMProperty(s, DOMWindow.WINDOW, "document", Value.makeObject(HTMLDocument.INSTANCES).setReadOnly());
    }
}
