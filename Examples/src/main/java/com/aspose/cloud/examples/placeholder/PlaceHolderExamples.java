package com.aspose.cloud.examples.placeholder;

import com.aspose.slides.ApiException;
import com.aspose.slides.api.PlaceholdersApi;
import com.aspose.slides.model.PlaceholderResponse;
import com.aspose.slides.model.PlaceholdersResponse;
import com.aspose.slides.model.request.GetSlidesPlaceholderRequest;
import com.aspose.slides.model.request.GetSlidesPlaceholdersRequest;

public class PlaceHolderExamples {

	PlaceholdersApi api;

	public PlaceHolderExamples() {
		api = new PlaceholdersApi(AppSID, SecretKey);
	}


	final static String AppSID = "";
	final static String SecretKey = "";

	private GetSlidesPlaceholderRequest createGetSlidesPlaceholderRequest() {
		GetSlidesPlaceholderRequest request = new GetSlidesPlaceholderRequest();
		request.setName("test.pptx");
		request.setSlideIndex(1);
		request.setPlaceholderIndex(0);

		return request;
	}
	
	private GetSlidesPlaceholdersRequest createGetSlidesPlaceholdersRequest() {
        GetSlidesPlaceholdersRequest request = new GetSlidesPlaceholdersRequest();
        request.setName("test.pptx");
		request.setSlideIndex(1);
        return request;
    }

	public void getSlidesPlaceholderExample() throws ApiException, Exception {

		PlaceholderResponse response = null;
		try {
			GetSlidesPlaceholderRequest request = createGetSlidesPlaceholderRequest();
			response = api.getSlidesPlaceholder(request);
			System.out.println(response.getCode());

		} catch (Exception ex) {
			ex.printStackTrace();
		}

	}
	
	public void getSlidesPlaceholdersTest() throws ApiException, Exception {
        PlaceholdersResponse response = null;
        try {
            GetSlidesPlaceholdersRequest request = createGetSlidesPlaceholdersRequest();
            response = api.getSlidesPlaceholders(request);
			System.out.println(response.getCode());

        } catch (Exception ex) {
        	ex.printStackTrace();
        }

    }
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
