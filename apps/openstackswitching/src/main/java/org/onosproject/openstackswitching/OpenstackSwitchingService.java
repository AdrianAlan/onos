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
package org.onosproject.openstackswitching;

/**
 * It handles port management REST API from Openstack for VMs.
 */
public interface OpenstackSwitchingService {

    /**
     * Store the port information created by Openstack.
     *
     * @param openstackPort port information
     */
    void createPorts(OpenstackPort openstackPort);

    /**
     * Removes flow rules corresponding to the port removed by Openstack.
     *
     */
    void deletePorts();

    /**
     * Updates flow rules corresponding to the port information updated by Openstack.
     *
     */
    void updatePorts();

    /**
     * Store the network information created by openstack.
     *
     * @param openstackNetwork network information
     */
    void createNetwork(OpenstackNetwork openstackNetwork);

    /**
     * Store the subnet information created by openstack.
     *
     * @param openstackSubnet subnet information
     */
    void createSubnet(OpenstackSubnet openstackSubnet);
}
