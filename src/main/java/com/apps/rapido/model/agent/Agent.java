package com.apps.rapido.model.agent;

import com.apps.rapido.model.contact.Contact;

public class Agent {

    private String agentId;
    private Contact agentContact;
    private Status agentStatus;

    public Agent() {};

    public Agent(String agentId, Contact agentContact, Status agentStatus) {
        this.agentId = agentId;
        this.agentContact = agentContact;
        this.agentStatus = agentStatus;
    };

    public String getAgentId() {
        return agentId;
    }

    public void setAgentId(String agentId) {
        this.agentId = agentId;
    }

    public Contact getAgentContact() {
        return agentContact;
    }

    public void setAgentContact(Contact agentContact) {
        this.agentContact = agentContact;
    }

    public Status getAgentStatus() {
        return agentStatus;
    }

    public void setAgentStatus(Status agentStatus) {
        this.agentStatus = agentStatus;
    }
}
