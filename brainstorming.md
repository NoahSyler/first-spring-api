# Thinking

I would like to update this app to handle multiple players now.

The Spring API would need to generate sessions and connect clients.
 - maybe 2 clients could request to be in the same session? 
 - Might handle the sessions with a group number in a cache like Reddis
   - I am wondering if I shouldn't expose that group number to the clients?
   - It could be used to link, but it may also be easy to use to throw a wrench in the process.
     - This can be handled later, but maybe a group number will be used to identify 2 client sessions on the backend, and the clients will only know about their session information

So the React app will request a session
The api will: 
 - tell the client if it is an x or o
 - logically connect it with another client
 - take the input from every turn
 - validate date, ensure turns are in proper order, and declare winners

A login functionality may also be nice.
If users could log in, user stats and previous games' information could also be stored

