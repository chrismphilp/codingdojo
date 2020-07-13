#include "ZigZagConversion.h"

std::string ZigZagConversion::convert(std::string s, int numRows) {
    int stringLength = s.length();
    if (stringLength <= numRows || numRows <= 1) return s;

    std::unordered_map<int, std::string> mapOfRows;
    bool down = false;
    int currentRow = 0;

    for (int i = 0; i < stringLength; i++) {
        if (currentRow == (numRows - 1) || currentRow == 0) down = !down;

        if (mapOfRows.find(currentRow) != mapOfRows.end()) {
            std::string curr = mapOfRows.at(currentRow);
            curr += s.at(i);
            mapOfRows[currentRow] = curr;
        } else {
            mapOfRows[currentRow] = s.at(i);
        }
        down ? currentRow++ : currentRow--;
    }

    std::string result = std::string();
    for (int i = 0; i < numRows; i++) {
        result.append(mapOfRows.at(i));
    }
    return result;
}
