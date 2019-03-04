package com.aspose.cloud.examples.layouts.masterslides;

import com.aspose.slides.ApiException;
import com.aspose.slides.api.MasterSlidesApi;
import com.aspose.slides.model.MasterSlideListResponse;
import com.aspose.slides.model.MasterSlideResponse;
import com.aspose.slides.model.request.GetMasterSlideRequest;
import com.aspose.slides.model.request.GetMasterSlidesListRequest;
import com.aspose.slides.model.request.PostCopyMasterSlideFromSourcePresentationRequest;

public class MasterSlidesExamples {
	MasterSlidesApi api;

	public MasterSlidesExamples() {
		api = new MasterSlidesApi(AppSID, SecretKey);
	}

	final static String AppSID = "78946fb4-3bd4-4d3e-b309-f9e2ff9ac6f9";
	final static String SecretKey = "b125f13bf6b76ed81ee990142d841195";

	private GetMasterSlideRequest createGetMasterSlideRequest() {
		GetMasterSlideRequest request = new GetMasterSlideRequest();
		request.setName("test.pptx");
		request.setSlideIndex(1);
		return request;
	}

	private GetMasterSlidesListRequest createGetMasterSlidesListRequest() {
		GetMasterSlidesListRequest request = new GetMasterSlidesListRequest();
		request.setName("test.pptx");
		return request;
	}
	private PostCopyMasterSlideFromSourcePresentationRequest createPostCopyMasterSlideFromSourcePresentationRequest() {
        PostCopyMasterSlideFromSourcePresentationRequest request = new PostCopyMasterSlideFromSourcePresentationRequest();
        request.setName("test.pptx");        
        request.setCloneFrom("test.pptx");
        request.setCloneFromPosition(1);
        request.setApplyToAll(true);
        return request;
    }

	public void getMasterSlideExample() throws ApiException, Exception {
		MasterSlideResponse response = null;
		try {
			GetMasterSlideRequest request = createGetMasterSlideRequest();
			response = api.getMasterSlide(request);
			System.out.println(response.getCode());

		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	public void getMasterSlidesListExample() throws ApiException, Exception {
		MasterSlideListResponse response = null;
		try {
			GetMasterSlidesListRequest request = createGetMasterSlidesListRequest();
			response = api.getMasterSlidesList(request);
			System.out.println(response.getCode());

		} catch (Exception ex) {
			ex.printStackTrace();
		}

	}

	public void postCopyMasterSlideFromSourcePresentationExample() throws ApiException, Exception {
		MasterSlideResponse response = null;		
		try {
			PostCopyMasterSlideFromSourcePresentationRequest request = createPostCopyMasterSlideFromSourcePresentationRequest();
			response = api.postCopyMasterSlideFromSourcePresentation(request);
			System.out.println(response.getCode());

		} catch (Exception ex) {
			ex.printStackTrace();
		}

	}

	public static void main(String[] args) throws ApiException, Exception {
	}

}
