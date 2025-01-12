// This file contains Freeplane API reference for Groovy scripting.

/*
  AttributesRO
*/

/*
For the following code examples you can paste the following branch in Freeplane.
Select and copy the following lines and paste as a branch from the selected node in your mind map.

Sample Branch 01
	item A: Attributes
		item A1
		+	myAttribute	my text value
		+	aaa	v_aaa
		item A2
		+	otherAttribute	aaa
		item A3
		item A4
		+	aaa	first
		+	bbb	second
		+	aaa	third
		+	aaa	fourth
	item B
	item C

 */

// Returns "true", if the selected node contains an attribute key that is equal to "aaa". Returns "false", otherwise.
/*
    using "Sample Branch 01":
    selecting
        node "item A1" returns true
        node "item A2" returns false
        node "item A3" returns false
        node "item A4" returns true
 */
node.attributes.containsKey("aaa")

// Returns the index of the first attribute with the name "aaa" if one exists or -1 otherwise.
/*
    using "Sample Branch 01":
    selecting
        node "item A1" returns 1 (it's the second attribute)
        node "item A2" returns -1
        node "item A3" returns -1
        node "item A4" returns 0 (the first one is in the first attribute's position)
 */
node.attributes.findFirst("aaa")

// Returns the attribute value at the index 1.
/*
    using "Sample Branch 01":
    selecting
        node "item A1" returns 'v_aaa'
        node "item A2" returns exception: "org.freeplane.plugin.script.ExecuteScriptException: Array index out of range: 1, Array index out of range: 1"
        node "item A3" returns exception: "org.freeplane.plugin.script.ExecuteScriptException: Array index out of range: 1, Array index out of range: 1"
        node "item A4" returns 'second'
 */
node.attributes.get(1)

//  Returns the values of all the attributes that has the key equal to "aaa".
/*
    using "Sample Branch 01":
    selecting
        node "item A1" returns [v_aaa]
        node "item A2" returns []
        node "item A3" returns []
        node "item A4" returns [first, third, fourth]
 */
node.attributes.getAll("aaa")

// Returns the first value of an attribute with the name "aaa" or null otherwise.
/*
    using "Sample Branch 01":
    selecting
        node "item A1" returns v_aaa
        node "item A2" returns null
        node "item A3" returns null
        node "item A4" returns first
 */
node.attributes.getFirst("aaa")

// Returns the attribute key at the index 1.
/*
    using "Sample Branch 01":
    selecting
        node "item A1" returns aaa
        node "item A2" returns exception: "org.freeplane.plugin.script.ExecuteScriptException: Array index out of range: 1, Array index out of range: 1"
        node "item A3" returns exception: "org.freeplane.plugin.script.ExecuteScriptException: Array index out of range: 1, Array index out of range: 1"
        node "item A4" returns bbb
 */
node.attributes.getKey(1)

// Returns all attributes as a map.
/*
    using "Sample Branch 01":
    selecting
        node "item A1" returns {myAttribute=my text value, aaa=v_aaa}
        node "item A2" returns {otherAttribute=aaa}
        node "item A3" returns {}
        node "item A4" returns {aaa=fourth, bbb=second}  // (note that it takes for aaa the value of the last attribute)
 */
node.attributes.map

// Returns all attribute names in the proper sequence.
/*
    using "Sample Branch 01":
    selecting
        node "item A1" returns [myAttribute, aaa]
        node "item A2" returns [otherAttribute]
        node "item A3" returns []
        node "item A4" returns [aaa, bbb, aaa, aaa]
 */
node.attributes.names

// Returns "true", if the selected node has no attributes. Returns "false", otherwise.
/*
    using "Sample Branch 01":
    selecting
        node "item A1" returns false
        node "item A2" returns false
        node "item A3" returns true
        node "item A4" returns false
*/
 node.attributes.empty

// Returns the number of attributes.
/*
    using "Sample Branch 01":
    selecting
        node "item A1" returns 2
        node "item A2" returns 1
        node "item A3" returns 0
        node "item A4" returns 4
*/
node.attributes.size()

/*
  Attributes
*/

// Adds an attribute with key "aaa" and value "xxx", no matter if an attribute with the given name already exists.

node.attributes.add("aaa", "xxx")

// Adds an attribute with key "aaa", value "8", with formatting pattern "0.0", no matter if an attribute with the given name already exists.

node.attributes.add("aaa", "8", "0.0")

// Removes all attributes of the selected node.

node.attributes.clear()

// Optimizes widths of attribute view columns according to contents.

node.attributes.optimizeWidths()

// Removes the attribute at the index 1.

node.attributes.remove(1)

// Removes all attributes with name "aaa".

node.attributes.removeAll("aaa")

// Sets "xxx" as the value of the attribute at index 1.

node.attributes.set(1,"xxx")

// Sets "aaa" as the key, and "xxx" as the value of the attribute at index 1.

node.attributes.set(1, "aaa", "xxx")

// Sets "aaa" as the key, "8" as the value, and "0.0" as the format pattern of the attribute at index 1.

node.attributes.set(1, "aaa", "8", "0.0")

// Adds an attribute with key "aaa" and value "xxx" if there is no attribute with the given key or changes the value of the first attribute with the given key.

node.attributes.set("aaa", "xxx")

// Sets "0.0" as the format pattern to the attribute at index 1.

node.attributes.setFormat(1, "0.0")

/*
  Cloud
*/

// Returns the color of the cloud set to the selected node.

node.cloud.color

// Returns the color code of the cloud set to the selected node.

node.cloud.colorCode

// Returns "true" if the selected node has a cloud enabled.

node.cloud.enabled

// Returns the shape of the cloud set to the selected node.

node.cloud.shape

// Sets "YELLOW" as the color of the selected node cloud.

node.cloud.color = java.awt.Color.YELLOW

// Sets "#ffff00ff" as the color code of the selected node cloud.

node.cloud.colorCode = "#ffff00ff"

// Enables a cloud in the selected node.

node.cloud.enabled = true

// Sets "STAR" as the shape of the selected node cloud.

node.cloud.shape = "STAR"
