/*
 * Copyright 2014-2018 Groupon, Inc
 * Copyright 2014-2018 The Billing Project, LLC
 *
 * The Billing Project licenses this file to you under the Apache License, version 2.0
 * (the "License"); you may not use this file except in compliance with the
 * License.  You may obtain a copy of the License at:
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.  See the
 * License for the specific language governing permissions and limitations
 * under the License.
 */


package org.killbill.billing.client.model.gen;

import java.util.Objects;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import org.killbill.billing.catalog.api.PhaseType;
import org.killbill.billing.client.model.gen.Duration;
import org.killbill.billing.client.model.gen.Fixed;
import org.killbill.billing.client.model.gen.Recurring;
import org.killbill.billing.client.model.gen.Usage;

/**
 *           DO NOT EDIT !!!
 *
 * This code has been generated by the Kill Bill swagger generator.
 *  @See https://github.com/killbill/killbill-swagger-coden
 */
import org.killbill.billing.client.model.KillBillObject;

public class PlanPhase {

    private Duration duration = null;

    private Fixed fixed = null;

    private Recurring recurring = null;

    private List<Usage> usages = null;

    private PhaseType phaseType = null;

    private String name = null;

    private String prettyName = null;


    public PlanPhase() {
    }

    public PlanPhase(final Duration duration,
                     final Fixed fixed,
                     final Recurring recurring,
                     final List<Usage> usages,
                     final PhaseType phaseType,
                     final String name,
                     final String prettyName) {
        this.duration = duration;
        this.fixed = fixed;
        this.recurring = recurring;
        this.usages = usages;
        this.phaseType = phaseType;
        this.name = name;
        this.prettyName = prettyName;

    }


    public PlanPhase setDuration(final Duration duration) {
        this.duration = duration;
        return this;
    }

    public Duration getDuration() {
        return duration;
    }

    public PlanPhase setFixed(final Fixed fixed) {
        this.fixed = fixed;
        return this;
    }

    public Fixed getFixed() {
        return fixed;
    }

    public PlanPhase setRecurring(final Recurring recurring) {
        this.recurring = recurring;
        return this;
    }

    public Recurring getRecurring() {
        return recurring;
    }

    public PlanPhase setUsages(final List<Usage> usages) {
        this.usages = usages;
        return this;
    }

    public PlanPhase addUsagesItem(final Usage usagesItem) {
        if (this.usages == null) {
            this.usages = new ArrayList<Usage>();
        }
        this.usages.add(usagesItem);
        return this;
    }

    public List<Usage> getUsages() {
        return usages;
    }

    public PlanPhase setPhaseType(final PhaseType phaseType) {
        this.phaseType = phaseType;
        return this;
    }

    public PhaseType getPhaseType() {
        return phaseType;
    }

    public PlanPhase setName(final String name) {
        this.name = name;
        return this;
    }

    public String getName() {
        return name;
    }

    public PlanPhase setPrettyName(final String prettyName) {
        this.prettyName = prettyName;
        return this;
    }

    public String getPrettyName() {
        return prettyName;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PlanPhase planPhase = (PlanPhase) o;
        return Objects.equals(this.duration, planPhase.duration) &&
        Objects.equals(this.fixed, planPhase.fixed) &&
        Objects.equals(this.recurring, planPhase.recurring) &&
        Objects.equals(this.usages, planPhase.usages) &&
        Objects.equals(this.phaseType, planPhase.phaseType) &&
        Objects.equals(this.name, planPhase.name) &&
        Objects.equals(this.prettyName, planPhase.prettyName);

    }

    @Override
    public int hashCode() {
        return Objects.hash(duration,
                            fixed,
                            recurring,
                            usages,
                            phaseType,
                            name,
                            prettyName);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PlanPhase {\n");
        
        sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
        sb.append("    fixed: ").append(toIndentedString(fixed)).append("\n");
        sb.append("    recurring: ").append(toIndentedString(recurring)).append("\n");
        sb.append("    usages: ").append(toIndentedString(usages)).append("\n");
        sb.append("    phaseType: ").append(toIndentedString(phaseType)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    prettyName: ").append(toIndentedString(prettyName)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }
}

