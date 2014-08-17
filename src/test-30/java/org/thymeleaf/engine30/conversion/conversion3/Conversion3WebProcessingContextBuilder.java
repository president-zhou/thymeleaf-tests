/*
 * =============================================================================
 * 
 *   Copyright (c) 2011-2014, The THYMELEAF team (http://www.thymeleaf.org)
 * 
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 * 
 *       http://www.apache.org/licenses/LICENSE-2.0
 * 
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 * 
 * =============================================================================
 */
package org.thymeleaf.engine30.conversion.conversion3;

import java.util.Locale;
import java.util.Map;

import org.springframework.validation.DataBinder;
import org.thymeleaf.testing.templateengine.context.web.SpringWebProcessingContextBuilder;
import org.thymeleaf.testing.templateengine.testable.ITest;


public class Conversion3WebProcessingContextBuilder extends SpringWebProcessingContextBuilder {



    public Conversion3WebProcessingContextBuilder() {
        super();
        setApplicationContextConfigLocation("classpath:engine30/conversion/conversion3/applicationContext.xml");
    }

    
    @Override
    protected void initBinder(
            final String bindingVariableName, final Object bindingObject,
            final ITest test, final DataBinder dataBinder, final Locale locale, 
            final Map<String,Object> variables) {
        
        dataBinder.registerCustomEditor(Integer.class, new IntegerPropertyEditor());

    }

    
}
