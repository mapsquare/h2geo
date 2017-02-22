/**
 * Copyright (C) 2016 eBusiness Information
 *
 * This file is part of OSM Contributor.
 *
 * OSM Contributor is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * OSM Contributor is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with OSM Contributor.  If not, see <http://www.gnu.org/licenses/>.
 */
package io.jawg.h2geo.parser.impl;


import io.jawg.h2geo.parser.TagParser;
import io.jawg.h2geo.parser.Type;

import java.util.List;

public class AutoCompleteTagParser implements TagParser {

    private static final int LIMIT = 6;

    @Override
    public Type getType() {
        return Type.TEXT;
    }

    @Override
    public boolean isCandidate(String key, List<String> values) {
        return values.size() > LIMIT;
    }

    @Override
    public boolean supports(String value) {
        return true;
    }

    @Override
    public int getPriority() {
        return Priority.NORMAL;
    }

    @Override
    public int hashCode() {
        return getPriority();
    }
}