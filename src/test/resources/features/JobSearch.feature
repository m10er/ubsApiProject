  @wip
  Feature:Job search with country and occupation information

    Scenario Outline:  test1

      Given The Post request method is sent to the JobsSearch endpoint with the value "<Job>".
      When The Jobs Count value is saved as Jobs Count.
      And The number of jobs in country "<Country>"is saved as expected Count.
      Given The Post request method is sent to the JobsSearch endpoint with the value "<Job>" and "<Country>".
      Then It is verified that the count value is smaller than Jobs Count.

      Examples:
        | Job                      | Country              |
        | test automation engineer | Zurich               |
        | test engineer            | Bern                 |


    Scenario Outline:  test2

      Given The Post request method is sent to the JobsSearch endpoint with the value "<Job>".
      When The Jobs Count value is saved as Jobs Count.
      And The number of jobs in country "<Country>"is saved as expected Count.
      Given The Post request method is sent to the JobsSearch endpoint with the value "<Job>" and "<Country>".
      And It is verified that the found Count value in "<Country>" is equal to the expected Count value.

      Examples:
        | Job                      | Country              |
        | test automation engineer | Zurich               |
        | test engineer            | Bern                 |

    Scenario Outline:  test

      Given The Post request method is sent to the JobsSearch endpoint with the value "<Job>".
      When The Jobs Count value is saved as Jobs Count.
      And The number of jobs in country "<Country>"is saved as expected Count.
      Given The Post request method is sent to the JobsSearch endpoint with the value "<Job>" and "<Country>".
      And It is verified that there is no country other than the filtered "<Country>".

      Examples:
        | Job                      | Country              |
        | test automation engineer | Zurich               |
        | test engineer            | Bern                 |



