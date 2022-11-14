carats <- c(0.23, 0.78, 1.3, 1.5, 2.3, 2.8, 3.4, 3.9, 4.5, 4.6, 5.3)
prices <- c(326, 327, 400, 456, 500, 534, 578, 603, 657, 688, 695)
diamonds <- data.frame(carat=carats, price=prices)

library(ggplot2) # download ggplot2 package

# basic plot
ggplot(diamonds, aes(x=carat, y=price)) +
  geom_point()

# change size of the points
ggplot(diamonds, aes(x=carat, y=price, size=carat, fill=carat)) +
  geom_point()

# fill interior of the points
ggplot(diamonds, aes(carat, price, size=carat, fill=carat)) +
  geom_point(shape=21) # adding shape=21

# paint outside of the points
ggplot(diamonds, aes(carat, price, size=carat, fill=carat)) +
  geom_point(shape=21, color='red') # give color='red', you can give any color

# it is hard to see the border of the point
ggplot(diamonds, aes(carat, price, size=carat, fill=carat)) +
  geom_point(shape=21, color='red', stroke=2) # give stroke to increase thickness

