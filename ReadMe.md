GraphQL is a modern way of writing APIs
The problem with REST is that we have some APIs and they respond with some fixed structure.

Suppose an Application has multiple clients like a Mobile Applications and a Web Applications
Now when we are landing on Homepage for mobile and Web both of them are supposed to be different, maybe we want to
show less information on the mobile home page

With REST we have two options:
1. Define separate APIs for Mobile and Web Home page - Extra Work
2. Use the Web Home page API only for mobile home Page also, but in this case we are over fetching data which we might
    never use.


With GraphQL, we can write dynamic queries to get the information which we want and avoid over fetching or under fetching,
Also if a new requirement comes for frontend we need not write a completely new API that we would do for REST.

That being said, to integrate GraphQL in a spring boot project, there are few steps we have to follow
1. First and foremost we need to have GraphQL dependency added in our maven file
2. Second lets discuss little bit about the architecture of this project, it's a simple project with two services User and Order
   User has 1 to many relation with Order and Order has Many to One with User
3. The next thing is that unlike REST which has different methods like GET/POST/PATCH/PUT/DELETE, GraphQl deals with queries and 
    and mutations, so all the GET things are mapped with Queries and any new creation is updated with Mutation
4. One important thing is that we create a new Directory under resources folder named graphql and here we define schemas
   ending with .graphqls extension
5. This schema file has three major things like what data exists, what operations client can perform and what will be the structure 
   of response. For our application, you will notice we have two entities User and Order, so there would be two entries related 
   to it, next we define query - what all get calls can be made, next Mutations - this is the update part what all things can 
   be created and stored in the database