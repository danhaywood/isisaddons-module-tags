/*
 *  Copyright 2013~2014 Dan Haywood
 *
 *  Licensed under the Apache License, Version 2.0 (the
 *  "License"); you may not use this file except in compliance
 *  with the License.  You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing,
 *  software distributed under the License is distributed on an
 *  "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 *  KIND, either express or implied.  See the License for the
 *  specific language governing permissions and limitations
 *  under the License.
 */
package org.isisaddons.module.tags.fixture.scripts;

import org.isisaddons.module.tags.fixture.dom.ExampleTaggableEntities;
import org.isisaddons.module.tags.fixture.scripts.entities.Bar_Pepsi_Drink;
import org.isisaddons.module.tags.fixture.scripts.entities.Baz_McDonalds_FastFood;
import org.isisaddons.module.tags.fixture.scripts.entities.Bip_CocaCola_Drink;
import org.isisaddons.module.tags.fixture.scripts.entities.Bop_Levis_Clothing;
import org.apache.isis.applib.fixturescripts.DiscoverableFixtureScript;

public class ExampleTaggableEntitiesSetUpFixture extends DiscoverableFixtureScript {

    @Override
    protected void execute(ExecutionContext executionContext) {

        execute(new ExampleTaggableEntitiesTearDownFixture(), executionContext);

        execute(new Bip_CocaCola_Drink(), executionContext);
        execute(new Bar_Pepsi_Drink(), executionContext);
        execute(new Baz_McDonalds_FastFood(), executionContext);
        execute(new Bop_Levis_Clothing(), executionContext);
    }

    // //////////////////////////////////////

    @javax.inject.Inject
    private ExampleTaggableEntities exampleTaggableEntities;

}
