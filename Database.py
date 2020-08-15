# !/usr/bin/python3
# Requirement imports
import json
import datetime
import sys

from bson import json_util
from pymongo import MongoClient

# Database connection and selection
connection = MongoClient('localhost', 27017)
db = connection['city']
collection = db['inspections']


# Create new document in data base
def create_document(document):
	try:
		result=collection.insert_one(document)
		print("Document created succesfully!")
	except Exception as ve:
		sys.exit(str(ve))
	return result


# Reads document based of predetermined query input
def read_document(query):
	try:
		result=collection.find_one(query)
		print(type(result))
		print(result)
	except Exception as ve:
		sys.exit(str(ve))
	return result

# Update a documnet from a query and modifying with specified info
def update_document(query, info):
	try:
		result=collection.update_one(query, info)
		updatedDoc = read_document(query)
		print("UPDATE SUCCESSFUL!\n{result}\n{updatedDoc}")
	except Exception as ve:
		sys.exit(str(ve))
	return result

# Deletes document based on a query search
def delete_document(query):
	try:
		result=collection.delete_one(query)
		print("The document @ {query} has been completely deleted from the database.")
	except ValidationError as ve:
		abort(400, str(ve))
	return result

# Main function to run opperations and call functions
def main():
	date = datetime.datetime.now()
	
	document1 = { 

	"id" : "999999-2020-NASA",
	"certificate_number" : "1234567",
	"business_name" : "SpaceX Rocket Systems",
	"date" : "{date}",
	"result" : "Business Operational",
	"sector" : "Rocket Construction/Testing",
	"address" : {

		"number" : "12301",
		"street" : "Rocket Road",
		"city" : "Hawthorne",
		"state" : "CA",
		"zip" : "90250",

		}
	}

	document2 = { 

	"id" : "999998-2020-ACME",
	"certificate_number" : "7654321",
	"business_name" : "ACME Rocket Systems",
	"date" : "{date}",
	"result" : "Business Under Construction",
	"sector" : "Rocket Construction/Testing",
	"address" : {

		"number" : "12233",
		"street" : "Rocket Road",
		"city" : "Hawthorne",
		"state" : "CA",
		"zip" : "90250",

		}
	}

	added_info = {"$set" : {

	"result" : "Business Operational",
	"address" : 
		{

		"street" : "BlastOff Drive",
		"city" : "San Jose",
		"zip" : "90210"

		}
	}}

	# Query search information
	search_info = {"id" : "999998-2020-ACME"}


	# Call program functions
	create_document(document1)
	read_document(search_info)
	update_document(search_info, added_info)
	delete_document(document2)


  
  # Runs python script as a program
if __name__ == '__main__':
	main()
