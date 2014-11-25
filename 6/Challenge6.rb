#!/usr/bin/env ruby

puts (1..10_000).to_a.join(" ").tr("0"," ").split(" ").map{|n|n.to_i(10)}.inject(:+)

# 37359001
# and its so fast too haha
