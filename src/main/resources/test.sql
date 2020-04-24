DELETE from user;
INSERT INTO user(ID, CREATIONTIME, UPDATETIME, EMAIL,  PASSWORD, USERNAME) VALUES
  (1, TIMESTAMP '2017-10-10 08:45:56.468', TIMESTAMP '2017-10-10 08:45:56.468', 'gewoongijs@gmail.com', 'password', 'Gijs'),
   (2, TIMESTAMP '2017-10-10 08:45:56.468', TIMESTAMP '2017-10-10 08:45:56.468', 'roy@gmail.com', 'password', 'Roy'),
    (3, TIMESTAMP '2017-10-10 08:45:56.468', TIMESTAMP '2017-10-10 08:45:56.468', 'wesley@gmail.com', 'password', 'Wesley'),
    (4, TIMESTAMP '2017-10-10 08:45:56.468', TIMESTAMP '2017-10-10 08:45:56.468', 'costas@gmail.com', 'password', 'costas'),
    (5, TIMESTAMP '2017-10-10 08:45:56.468', TIMESTAMP '2017-10-10 08:45:56.468', 'andreai@gmail.com', 'password', 'andreia');

    DELETE FROM challenge;
    INSERT INTO challenge(ID, CREATIONTIME, UPDATETIME, DATE, DESCRIPTION, TITLE, VIEWERS) VALUES
      (1, TIMESTAMP '2017-10-10 08:45:56.468', TIMESTAMP '2017-10-10 08:45:56.468', '2017-10-10', 'Who can do the most push-ups in 3 minutes', 'Beastostherone', 0),
      (2, TIMESTAMP '2017-10-10 08:45:56.469', TIMESTAMP '2017-10-10 08:45:56.470', '2017-10-10', 'Who can drink the most water in 3 minutes', 'Bottomless Pit', 0),
      (3, TIMESTAMP '2017-10-10 08:45:56.468', TIMESTAMP '2017-10-10 08:45:56.468', '2017-10-10', 'White Whale', 'Who can eat the most marshmallows in 3 minutes', 0),
      (4, TIMESTAMP '2017-10-10 08:45:56.468', TIMESTAMP '2017-10-10 08:45:56.468', '2017-10-10', 'Who can fill up and blow the most ballons in 3 minutes', 'Big Bang', 0),
      (5, TIMESTAMP '2017-10-10 08:45:56.468', TIMESTAMP '2017-10-10 08:45:56.468', '2017-10-10', 'Who can put on the most t-shirts in 3 minutes', 'Snuggle Snowman', 0),
      (6, TIMESTAMP '2017-10-10 08:45:56.468', TIMESTAMP '2017-10-10 08:45:56.468', '2017-10-10', 'Who can deepthroat the furthest', 'Deep trouble', 0);


