package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import org.junit.Assert;
import pojo.Root;
import utilities.ApiMethods;

public class JobsSearchSteps {
    Root root = new Root();
    Response response;
    int jobCount;
    int expectedCount;


    @Given("The Post request method is sent to the JobsSearch endpoint with the value {string}.")
    public void thePostRequestMethodIsSentToTheJobsSearchEndpointWithTheValue(String job) {
       response= ApiMethods.jobSearchPostMethod(job,null);
       root = response.as(Root.class);
    }

    @When("The Jobs Count value is saved as Jobs Count.")
    public void theJobsCountValueIsSavedAsJobsCount() {
       jobCount = root.getJobsCount();
    }

    @And("The number of jobs in country {string}is saved as expected Count.")
    public void theNumberOfJobsInCountryIsSavedAsExpectedCount(String country) {
        int size=0;
        try {
            size = root.getFacets().getFacet().getFirst().getOptions().size();
        }catch (Exception e){
            System.out.println(e);
        }
        int actualCount= 0;

        if(size>0) {
            for (int i = 0; i < size; i++) {
                if(root.getFacets().getFacet().getFirst().getOptions().get(i).getOptionValue().contains(country)){
                    expectedCount = root.getFacets().getFacet().getFirst().getOptions().get(i).getCount();
                }
            }
        } else { expectedCount = 0; };

    }

    @Given("The Post request method is sent to the JobsSearch endpoint with the value {string} and {string}.")
    public void thePostRequestMethodIsSentToTheJobsSearchEndpointWithTheValueAnd(String job, String country) {
        response = ApiMethods.jobSearchPostMethod(job,country);
        root = response.as(Root.class);
    }

    @Then("It is verified that the count value is smaller than Jobs Count.")
    public void itIsVerifiedThatTheCountValueIsSmallerThanJobsCount() {

        int filterLocationJobCount = root.getJobsCount();
        Assert.assertTrue(filterLocationJobCount<jobCount);
    }


    @And("It is verified that the found Count value in {string} is equal to the expected Count value.")
    public void itIsVerifiedThatTheFoundCountValueInIsEqualToTheExpectedCountValue(String country) {

        int size=0;
        try {
          size = root.getFacets().getFacet().getFirst().getOptions().size();
        }catch (Exception e){
            System.out.println(e);
        }
        int actualCount= 0;

        if(size>0) {
            for (int i = 0; i < size; i++) {
                if (root.getFacets().getFacet().getFirst().getOptions().get(i).getOptionValue().contains(country)) {
                    actualCount = root.getFacets().getFacet().getFirst().getOptions().get(i).getCount();
                }
            }
        } else { actualCount = 0; };

        Assert.assertEquals(expectedCount, actualCount);
    }

    @And("It is verified that there is no country other than the filtered {string}.")
    public void itIsVerifiedThatThereIsNoCountryOtherThanTheFiltered(String country) {
        boolean result = true;
        int size=0;
        try {
            size = root.getFacets().getFacet().getFirst().getOptions().size();
        }catch (Exception e){
            System.out.println(e);
        }
        int actualCount= 0;

        if(size>0) {
            for (int i = 0; i < size; i++) {
                if(!root.getFacets().getFacet().get(0).getOptions().get(i).getOptionValue().contains(country)){
                    result = false;
                    break;
                }
            }
        } else { result = true; };

        Assert.assertTrue(result);
    }

}
