# agile-software-project

##Part 1

**Team Name:** Scrumdiddlyumptious

**Team Members:**

- Damian Kilday, Product owner
- Wesley Rolnick, Scrummaster
- Tarek Ajjour, Team Member
- Nathaniel Hedmann, Team Member
- Alec Moeser, Team Member
- Walter Thornton, Team Member

**Canvas Group Name:**  Project Team 3

**Slack Channel Name:** scrumdiddlyumptious

**Git Repository:** https://github.com/tajjour/balanceU

**Product Name:** BalanceU

**Far Vision:** Helping students balance their lives

**Near Vision:** Providing an application for students to share workload data about classes.

**Stakeholder Types:**

- Existing student (Real person)
- Prospective student
- Professor
- Application Admninistrator

**User Persona for Tarek Ajjour (Real Person):** https://app.xtensio.com/folio/9rrqkvy4

**Initial Backlog URL (with estimated PBIs):**  https://trello.com/b/JRxxjxt1/product-backlog 
**Backlog Note 1:** Backlog items are written as user stories, but you must click on each item to see the story.
**Backlog Note 2:** The numbers preceding the item titles are story points.

**Rationale for Backlog Ordering:**  We relied on one rule and three principles/considerations. The rule was based on logical dependence: no item could be ahead of any item that it depended on to work.  The first principle was "low effort/high value": things that could be done reasonably quickly given their payoff were prioritized.  The second principle was similarity: if one backlog item was closely related to another, they were kept sequential. The third consideration was related to testing: things were ordered so that we would have available easy testing capabilities for new items, without additional work.

**Definition of Ready:**  

A product backlog item is ready when:

- it has a meaningful title;
- it is expressed as a user story;
- it is defined clearly;
- it is not subject to further clear subdivision;
- it is estimated in story points; and
- it is not dependent on any other backlog item being completed first.

(In addition to course activities, this definition of ready also was influenced by articles by Scrum Inc., at https://www.scruminc.com/2014/07/20/definition-of-ready/; and Mike Cohn, Mountain Goat Software, at https://www.mountaingoatsoftware.com/blog/the-dangers-of-a-definition-of-ready.)

**Whole Team Relative Size Estimating Activity:** The Bucket System (see http://www.agileadvice.com/2013/07/30/referenceinformation/agile-estimation-with-the-bucket-system/).
Only development team members participated in estimating backlog item sizes.


##Part 2

**Forecast**: 12 story points

**Forecast Rationale:** Assuming a five-member dev team, and given the size of our base story point, we believed that between 2 and 3 story points per member per sprint was an appropriate size for someone working the equivalent of a 4-credit class.

**Current Sprint Kanban Board:** https://trello.com/b/R462ru7U/current-sprint  **Note 1**: Only dev team members participated in pulling backlog items into sprint backlog.  **Note 2:** No backlog item represented more than half the size of the spring forecast.

**Task Decomposition**: See inside each sprint backlog item, under chacklist labeled "Tasks."

**Sprint Burndown Chart**: [Click here to view the burndown chart.](https://docs.google.com/spreadsheets/d/1pRzY4CoVsj4yWWyvKTktf3S83xcvEK48YNCmer6jZO8/edit#gid=0)

**Daily Scrums:** 11/8; 11/10; 11/11; 11/12; 11/13.

*Documentation of 11/12 Daily Scrum:


Damian:  We need a quick update from you on what you've done in the past 24 hours and what you intend to do in the next 24 hours.  Also any luck writing a BDD test in Cucumber?  **Update from Slack**: Damian did get Cucumber working and added a BDD test to the project.  **Impediment**: problems getting floobits working.

Alec: Wrote unit tests.  Plans on managing the github requests from all of our updates.  **Impediment**: problems getting code to compile

Than: Rebuilt the project so that it now loads.  Plans to pickup an item off the product backlog.  **Impediment**: Issues with Floobits.

Tarek: Worked on the project to create more classes.  Setup Cucumber to handle BDD.  Will help Than with implementing fixed code.  Continuing to support WebEx and Teleconferences. **Impediment**: Issues with floobits.

Wes: Acted as Scrum Master.  Tracked progress to rubric.  Will be working on the floobits impediment that the team has had.

**Screenshot of Mob Programming:** [See the Mob.png screenshot attached](https://github.com/tajjour/balanceU/blob/master/Mob.png).  This group is continuing to use Floobits to program as a Mob.

**How to View Working Software:**

**Sprint Review:** 11/14:

[Link to working build.](http://54.183.213.247:8080/)

The first Sprint Review was held after class on 11/14.  Two Stakeholders attended and provided feedback on the current build.  Their suggestions were primarily centered around improving the UI and adding more functionality.  We also went through the Sprint items with our Product Owner (Damian) and agreed on what was done and what will continue in our backlog.


##Part 3

**Forecast**: 3

**Forecast Rationale:** Yesterday's weather (current forecast = previous velocity)

**Current Sprint Kanban Board:** https://trello.com/b/R462ru7U/current-sprint  **Note 1**: Only dev team members participated in pulling backlog items into sprint backlog.  **Note 2:** No backlog item represented more than half the size of the spring forecast.

**Task Decomposition**: See inside each sprint backlog item, under chacklist labeled "Tasks."

**Sprint Burndown Chart**: [Click here to view the burndown chart.](https://github.com/tajjour/balanceU/blob/master/Sprint2Burndown.png)

**Daily Scrums:** 11/19, 11/21, 11/23, 11/26, 11/27 

**Documentation of Daily Scrum:**
*Documentation of 11/21 Daily Scrum:

Damian: Working on Jenkins. Also working with stakeholders to refine product backlog. May need help from Than with getting Jenkins setup.

Alec: Continuing to work items in sprint. Plans to finish access list of classes.

Than: Working on getting the CI working. Also working on Bootstrap to make the interface look good.

Tarek: Working on bootstrap.  **Impediment ID**: Than and Tarek should work together to make sure they are not stepping on eachother.

Walt: Acting as stakeholder.  Will continue to work with Damian on tracking 

Wes: Acted as Scrum Master.  Tracked progress to rubric.  Will be working on the floobits as a pair and helping resolve impediments.

**Screenshot of Pair Programming:** [See the Mob.png screenshot attached](https://github.com/tajjour/balanceU/blob/master/pairProgramming.jpg).  This group is continuing to use Floobits to program as a Pair or Mob.  In addition, see https://github.com/tajjour/balanceU/blob/master/moreMobProgramming.jpg , reflecting additional mobbing over Webex.

**BDD Test Results:**
The team completed three BDD tests using Cucumber and Selenium. See BDD test result info and screenshot in the following document. https://github.com/tajjour/balanceU/blob/master/Sprint%202%20-%20BDD%20Testing%20Results.docx

**Continuous Integration Solution & Continuous Deployment Solution:** Our group has configured and deployed a Jenkins server to handle this for us.  Please see the attached Jenkins screenshots in the project directory for screenshots of Jenkins in action.  It is configured to run our tests and if they pass build and deploy to the server. https://github.com/tajjour/balanceU/blob/master/Jenkins%20CI-CD%20Report.docx

**How to View Working Software:** [Link to working build.](http://ec2-35-162-120-2.us-west-2.compute.amazonaws.com:9090)

**Sprint Review:** 11/27: The stakeholder reviewed the current product increment, and discussed the product backlog ordering. He was happy with the progress during the sprint just completed, and believed that the current product backlog (which reflected changes from the previous sprint review on 11/14) still reflected his priorities as a user, with "View class effort" and "Search class list" as the most important things to be done.

##Part 4

**Forecast**: 3

**Forecast Rationale:** Yesterday's weather (current forecast = previous velocity)

**Current Sprint Kanban Board:** https://trello.com/b/R462ru7U/current-sprint  **Note 1**: Only dev team members participated in pulling backlog items into sprint backlog.  **Note 2:** Backlog items representing more than half the size of the spring forecast were subdivided into smaller stories.

**Task Decomposition**: See inside each sprint backlog item, under chacklist labeled "Tasks."

**Sprint Burndown Chart**: [Click here to view the burndown chart.](https://github.com/tajjour/balanceU/blob/master/Sprint4Burndown.png)

**Daily Scrums:** 11/30; 12/4; 12/6; 12/10; 12/12

**Documentation of 12/10 Daily Scrum:**

Damian: Working Jenkins issues; will meet separately after meeting to work with Than on remaining issues. No impediments foreseen.

Alec: Still trying to get adding workload functionality to work since change from single to average workload; will coordinate with Tarek on remaining issues; no impediments foreseen.

Than: Will work with Damian on pending Jenkins issues; no impediments foreseen.

Tarek: Will work on html/thymeleaf issues on remaining stories; no impediments foreseen.

Walt: Has been prepping information radiators for effective sprint review; will coordinate with Damian for remaining issues; no impediments foreseen.


**Screenshot of Pair/Mob Programming:** See Part4_PairProgramming.jpg, in repo above, showing pair programming over Webex.

**BDD Test:**
The team completed  BDD tests using Cucumber and Selenium. See cucumber folder under src/test/java/com/harvard/group3/cucumber. Also, see BDD test result info and screenshots in the following document. https://github.com/tajjour/balanceU/blob/master/Sprint%203%20-%20BDD%20Testing%20Results.docx

**Unit Tests**: See various test classes under src/test/java/com/harvard/group3. (New unit tests are all in CourseClassTest.java.) Also, see Continuous Integration unit test results for sprint #3 in the following document. https://github.com/tajjour/balanceU/blob/master/Jenkins%20CI-CD%20Report.docx

**Continuous Integration Solution & Continuous Deployment Solution:** See Part 3, above. We are still using Jenkins to automatically run tests, build, and deploy to the server.

**How to View Working Software:** [Link to working build.](http://ec2-35-162-120-2.us-west-2.compute.amazonaws.com:9090/)

**Sprint Review Rehearsal:** Conducted on 12/11.

**Post-Sprint-Review Changes to Product Backlog** will be added by Product Owner after official sprint review.


##Sources

Open Source tools used:

- Bootstrap, getbootstrap.com
- Thymeleaf, thymeleaf.org
- Spring Boot, spring.io

Tutorials and Documentation:

- Spring Documentation, at http://spring.io/guides/
- Thymeleaf Documentation and Tutorials, at http://www.thymeleaf.org/doc/tutorials
- John Thompson, "Spring Boot Web Application Tutorial" (parts 1-3), at http://springframework.guru/spring-boot-web-application-part-1-spring-initializr/
- Eugen Baeldung, "Introduction to Using Thymeleaf in Spring," at http://www.baeldung.com/thymeleaf-in-spring-mvc
- Jquery AZ, "An HTML table plug-in for Bootstrap: with sorting, pagination, checkbox etc.," at http://www.jquery-az.com/an-html-table-plug-in-for-bootstrap-with-sorting-pagination-checkbox-etc/




