package com.freshvotes.domain;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

@Entity
public class Vote {
	@EmbeddedId
	private VoteId pk;
	private Boolean getUpvote;

	public Boolean getGetUpvote() {
		return getUpvote;
	}

	public void setGetUpvote(Boolean getUpvote) {
		this.getUpvote = getUpvote;
	}
	
	public VoteId getPk() {
		return pk;
	}

	public void setPk(VoteId pk) {
		this.pk = pk;
	}

	
	
}
