def get_name(record_store):
    return record_store["name"]


def find_record_by_title(record_title, record_store):
    found_record = None
    for record in record_store["records"]:
        if record["title"] == record_title:
            found_record = record
    
    return found_record


def sell_record(record, record_store):
    record_store["money"] += record["price"]
    record_store["records"].remove(record)
