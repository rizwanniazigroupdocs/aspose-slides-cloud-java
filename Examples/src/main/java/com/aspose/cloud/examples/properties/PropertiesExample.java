package com.aspose.cloud.examples.properties;

import com.aspose.slides.ApiException;
import com.aspose.slides.api.PropertiesApi;
import com.aspose.slides.model.DocumentProperties;
import com.aspose.slides.model.DocumentPropertiesResponse;
import com.aspose.slides.model.DocumentProperty;
import com.aspose.slides.model.DocumentPropertyResponse;
import com.aspose.slides.model.request.DeleteSlidesDocumentPropertiesRequest;
import com.aspose.slides.model.request.DeleteSlidesDocumentPropertyRequest;
import com.aspose.slides.model.request.GetSlidesDocumentPropertiesRequest;
import com.aspose.slides.model.request.GetSlidesDocumentPropertyRequest;
import com.aspose.slides.model.request.PostSlidesSetDocumentPropertiesRequest;
import com.aspose.slides.model.request.PutSlidesSetDocumentPropertyRequest;

public class PropertiesExample {

	private final PropertiesApi api;

	final static String AppSID = "";
	final static String SecretKey = "";

	public PropertiesExample() {
		api = new PropertiesApi(AppSID, SecretKey);
	}
	 private PutSlidesSetDocumentPropertyRequest createPutSlidesSetDocumentPropertyRequest() {
	        PutSlidesSetDocumentPropertyRequest request = new PutSlidesSetDocumentPropertyRequest();
			request.setName("test.pptx");
	        request.setPropertyName("author");
	        request.setProperty(new DocumentProperty().name("author"));

	        return request;
	    }
	private DeleteSlidesDocumentPropertyRequest createDeleteSlidesDocumentPropertyRequest() {
		DeleteSlidesDocumentPropertyRequest request = new DeleteSlidesDocumentPropertyRequest();
		request.setName("test.pptx");
		request.setPropertyName("author");
		return request;
	}

	private DeleteSlidesDocumentPropertiesRequest createDeleteSlidesDocumentPropertiesRequest() {
		DeleteSlidesDocumentPropertiesRequest request = new DeleteSlidesDocumentPropertiesRequest();
		request.setName("test.pptx");
		return request;
	}

	public void deleteSlidesDocumentPropertiesExample() throws ApiException, Exception {
		DocumentPropertiesResponse response = null;
		try {
			DeleteSlidesDocumentPropertiesRequest request = createDeleteSlidesDocumentPropertiesRequest();
			response = api.deleteSlidesDocumentProperties(request);
			System.out.println(response.getCode());

		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	private GetSlidesDocumentPropertiesRequest createGetSlidesDocumentPropertiesRequest() {
		GetSlidesDocumentPropertiesRequest request = new GetSlidesDocumentPropertiesRequest();
		request.setName("test.pptx");
		return request;
	}

	public void deleteSlidesDocumentPropertyExample() throws ApiException, Exception {
		DocumentPropertiesResponse response = null;
		try {
			DeleteSlidesDocumentPropertyRequest request = createDeleteSlidesDocumentPropertyRequest();
			response = api.deleteSlidesDocumentProperty(request);
			System.out.println(response.getCode());
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	private PostSlidesSetDocumentPropertiesRequest createPostSlidesSetDocumentPropertiesRequest() {
		PostSlidesSetDocumentPropertiesRequest request = new PostSlidesSetDocumentPropertiesRequest();
		DocumentProperties properties = new DocumentProperties();
		properties.addListItem(new DocumentProperty().name("author"));
		request.setName("test.pptx");
		request.setProperties(properties);

		return request;
	}

	private GetSlidesDocumentPropertyRequest createGetSlidesDocumentPropertyRequest() {
		GetSlidesDocumentPropertyRequest request = new GetSlidesDocumentPropertyRequest();
		request.setName("test.pptx");
		request.setPropertyName("author");
		return request;
	}

	public void getSlidesDocumentPropertiesExample() throws ApiException, Exception {
		DocumentPropertiesResponse response = null;
		try {
			GetSlidesDocumentPropertiesRequest request = createGetSlidesDocumentPropertiesRequest();
			response = api.getSlidesDocumentProperties(request);
			System.out.println(response.getCode());
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	public void getSlidesDocumentPropertyTest() throws ApiException, Exception {
		DocumentPropertyResponse response = null;
		try {
			GetSlidesDocumentPropertyRequest request = createGetSlidesDocumentPropertyRequest();
			response = api.getSlidesDocumentProperty(request);
			System.out.println(response.getCode());

		} catch (Exception ex) {
		}

	}

	public void postSlidesSetDocumentPropertiesTest() throws ApiException, Exception {
		DocumentPropertiesResponse response = null;
		try {
			PostSlidesSetDocumentPropertiesRequest request = createPostSlidesSetDocumentPropertiesRequest();
			response = api.postSlidesSetDocumentProperties(request);
			System.out.println(response.getCode());
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	public void putSlidesSetDocumentPropertyTest() throws ApiException, Exception {
		DocumentPropertyResponse response = null;
		try {
			PutSlidesSetDocumentPropertyRequest request = createPutSlidesSetDocumentPropertyRequest();
			response = api.putSlidesSetDocumentProperty(request);
			System.out.println(response.getCode());

		} catch (Exception ex) {
			ex.printStackTrace();
		}

	}

	public static void main(String[] args) {
	}

}
