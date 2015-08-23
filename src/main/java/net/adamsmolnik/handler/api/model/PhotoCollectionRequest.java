package net.adamsmolnik.handler.api.model;

/**
 * @author asmolnik
 *
 */
public class PhotoCollectionRequest {

	private String principalId;

	private String photoTakenDate;

	public String getPrincipalId() {
		return principalId;
	}

	public void setPrincipalId(String principalId) {
		this.principalId = principalId;
	}

	public String getPhotoTakenDate() {
		return photoTakenDate;
	}

	public void setPhotoTakenDate(String photoTakenDate) {
		this.photoTakenDate = photoTakenDate;
	}

}
