/*
 * Copyright 2015 Open Networking Laboratory
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

package org.onosproject.pcepio.protocol;

import org.jboss.netty.buffer.ChannelBuffer;
import org.onosproject.pcepio.exceptions.PcepParseException;

/**
 * Abstraction of an entity providing PCEP Message Reader.
 */
public interface PcepMessageReader<T> {

    /**
     * Reads the Objects in the PCEP Message and Returns PCEP Message.
     *
     * @param bb Channel Buffer
     * @return PCEP Message
     * @throws PcepParseException while parsing PCEP message.
     * @throws PcepParseException when received message is empty
     */
    T readFrom(ChannelBuffer bb) throws PcepParseException;
}
