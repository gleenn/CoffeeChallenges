#!/usr/bin/env ruby

solutions = []
(1..9).to_a.permutation do |a|
	(1..9).each do |cut|
		numerator = a.take(cut).join("").to_i(10)
		denominator = a.drop(cut).join("").to_i(10)
		solutions << [numerator, denominator] if 3 * numerator == denominator 
	end
end
solutions.each do |solution|
	print solution
	puts
end

# [5823, 17469]
# [5832, 17496]
