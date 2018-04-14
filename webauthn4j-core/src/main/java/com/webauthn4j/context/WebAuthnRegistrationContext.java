/*
 * Copyright 2002-2018 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.webauthn4j.context;

/**
 * WebAuthnRegistrationContext
 */
public class WebAuthnRegistrationContext {

    private byte[] collectedClientData;
    private byte[] attestationObject;
    private RelyingParty relyingParty;

    public WebAuthnRegistrationContext(byte[] collectedClientData,
                                       byte[] attestationObject,
                                       RelyingParty relyingParty) {

        this.collectedClientData = collectedClientData;
        this.attestationObject = attestationObject;
        this.relyingParty = relyingParty;
    }

    public byte[] getCollectedClientData() {
        return collectedClientData;
    }

    public byte[] getAttestationObject() {
        return attestationObject;
    }

    public RelyingParty getRelyingParty() {
        return relyingParty;
    }
}