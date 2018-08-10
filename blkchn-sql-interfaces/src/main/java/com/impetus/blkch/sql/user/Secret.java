/*******************************************************************************
* * Copyright 2018 Impetus Infotech.
* *
* * Licensed under the Apache License, Version 2.0 (the "License");
* * you may not use this file except in compliance with the License.
* * You may obtain a copy of the License at
* *
* * http://www.apache.org/licenses/LICENSE-2.0
* *
* * Unless required by applicable law or agreed to in writing, software
* * distributed under the License is distributed on an "AS IS" BASIS,
* * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
* * See the License for the specific language governing permissions and
* * limitations under the License.
******************************************************************************/
package com.impetus.blkch.sql.user;

import com.impetus.blkch.sql.parser.LogicalPlan;

public class Secret extends LogicalPlan {
    
    public static final String DESCRIPTION = "SECRET";
    
    private String value;
    
    public Secret(String value) {
        super(DESCRIPTION + ":" + value);
        this.value = value;
    }
    
    public String getValue() {
        return value;
    }

}