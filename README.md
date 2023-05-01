## Introduction

The repo was built to test out the deployment on [render.com](https://render.com/), a cloud platform that offers a seamless experience to deploy and manage applications with ease. Render.com provides a fully free and transparent experience without asking for any payment information upfront. This platform is perfect for personal projects, allowing users to deploy applications with just a few clicks. 

## Backend

### Technologies Used
- Spring Boot 2.7.11
- JDK 17
- PostgreSQL

### Build and Run
Follow the [readme](https://github.com/aabir121/render_deploy/blob/master/backend/README.md) for the backend project.

### Deployment on Render

#### Creating a PostgreSQL Instance on Render.com

- Navigate to your dashboard, and click on the New icon in the top right corner of the page.
- Choose PostgreSQL from the list of options.
- Provide a name for your instance and the database name.
- It's recommended to select a region that is closest to you.
- Select the `FREE` instance type which offers `256MB` of memory and `1GB` of storage (sufficient for personal projects).
- Click the Create button at the bottom of the page.
- Wait for the instance to be created, then head over to the instance from your dashboard.
- Note down the user, password, and DB URL information from the instance details page.

#### Creating a Web Service Instance on Render.com
- Similar to the previous step, select the New icon from the header and choose Web Service.
- Connect your `GitHub` or `GitLab` account if you haven't already done so.
- Choose the repository that you want to use for this service.
  - Fill in all the information in the provided form. For example:
  - Indicate `backend` as the root directory to indicate where the service should be located.
  - Choose the region closest to you.
  - Indicate `master` as your branch. Render will use this information to ensure auto-deployment once something is merged to master.
  - Choose `docker` as your runtime as there is no direct support for `Java` (Render supports Elixir, Go, Node, Python3, Ruby, and Rust).
  - Select the `FREE` instance again. 
- In the `ADVANCED` section, fill in the necessary environment variables to run the Docker container. Follow the instructions provided in the backend README.
  - Leave `ALLOWED_ORIGIN` empty for now. We will update it after deploying the static site.
- Click the Create Web Service button at the bottom.
- Wait for the backend service to be built and deployed.
- Once done, navigate to the instance from your dashboard.
- You will find the URL where it was deployed. To check if it was properly deployed, use `<base-url>/api/data` to hit the test API that we wrote in our backend repo.

The webservice is now publicly available with the provided URL.
- You can find the logs in the `Logs` section of the service dashboard.
- Anything that is merged to `master` will trigger an automatic deployment. This option can be turned off from Settings. You can also trigger a Manual Deployment from the service dashboard using the Manual Deployment button.

## Frontend
Built using Angular 14. Follow the [readme](https://github.com/aabir121/render_deploy/blob/master/frontend/README.md) available for the frontend project.

### Deployment on Render
At first, modify your `environment.prod.ts` file as mentioned in [readme](https://github.com/aabir121/render_deploy/blob/master/frontend/README.md) and update the API_URL with the web service url that we created above.

#### Creating a Static Site in Render.com
- Click on the "New" icon from the header and choose "Static Site".
- If you have not connected your GitHub/GitLab account before, it will ask you to do so.
- Choose the repository that you want to deploy as a static site.
- Fill out the required information on the setup screen, making sure to pay attention to the following:
  - Choose the branch you want to deploy (e.g. `master`)
  - Specify the root directory for your static site (e.g. `frontend`)
  - Set your build command (e.g. `npm build`)
  - Specify the publish directory where your build artifacts will be (e.g. `dist`)
- Click on the "Create Static Site" button to start building and deploying your static site. This may take some time.
- Once the deployment is complete, go to the instance from your Render dashboard and note down the URL for your static site.
- Go back to the dashboard for your backend service and navigate to the "Environment" section.
- Set the `ALLOWED_ORIGIN` environment variable to the URL of your static site to allow requests to the web service.
- You can now use the static site URL to browse your application.

## Contact
By following these guidelines, you can deploy your own personal projects with ease. We hope that you find these instructions helpful and thank you for using our guide. If you have any questions or feedback, please do not hesitate to contact [aabir121@gmail.com](aabir121@gmail.com).
